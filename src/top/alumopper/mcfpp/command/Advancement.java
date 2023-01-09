package top.alumopper.mcfpp.command;
import top.alumopper.mcfpp.Project;
import top.alumopper.mcfpp.exception.ArgumentNotMatchException;
import top.alumopper.mcfpp.type.ID;
import top.alumopper.mcfpp.type.Selector;

import java.util.Arrays;
import java.util.logging.Level;

/**
 给予或移除玩家的进度
 <pre>
 {@code
 advancement (grant|revoke) <targets> everything
 advancement (grant|revoke) <targets> only <advancement> [<criterion>]
 advancement (grant|revoke) <targets> (from|through|until) <advancement>
 }
 </pre>
*/
public class Advancement extends Command
{
	private static String[] gr = new String[]{"grant", "revoke"};
	private static String[] eoftu = new String[] {"everything", "only", "from", "through", "until"};
	private static String[] oftu = new String[] {"only", "from", "through", "until"};
	private static String[] ftu = new String[] {"from", "through", "until"};

	private String grant_revoke;
	private Selector target;
	private String[] args;

	public Advancement(String grant_revoke, Selector target, String... args) throws ArgumentNotMatchException {
		//检查参数
		if (!Arrays.asList(gr).contains(grant_revoke))
		{
			throw new ArgumentNotMatchException("参数错误:\"" + grant_revoke + "\"。应当为\"grant\"或\"revoke\"");
		}
		if (!Arrays.asList(eoftu).contains(args[0]))
		{
			throw new ArgumentNotMatchException("参数错误:\"" + args[0] + "\"。应当为\"everything\", \"only\", \"from\", \"through\"或\"until\"");
		}
		if (Arrays.asList(oftu).contains(args[0]))
		{
			if (!ID.IsLegal(args[1]))
			{
				throw new ArgumentNotMatchException("参数错误:\"" + args[1] + "。期望一个命名空间id");
			}
			if (Arrays.asList(ftu).contains(args[0]))
			{
				if (args.length > 2)
				{
					Project.logger.warn( "过多的参数:\"" + args[2] + "等");
				}
			}
			else
			{
				if (args.length > 3)
				{
					Project.logger.warn( "过多的参数:\"" + args[3] + "等");
				}
			}
		}
		this.grant_revoke = grant_revoke;
		this.target = target;
		this.args = args;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("advancement " + grant_revoke + " " + target);
		for (String arg : args)
		{
			sb.append(" ").append(arg);
		}
		return sb.toString();
	}
}
