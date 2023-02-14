package top.alumopper.mcfpp.lib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

public class UwU {
    public static ArrayList<String> tips = new ArrayList<>();

    static {
        tips.add("Hello Minecraft!");
        tips.add("Also try JustMCF!");
        tips.add("$time");
        tips.add("今天你也很努力呢喵！");
        tips.add("Mojang什么时候出动态命令捏……（呆");
        tips.add("喂，刚刚咱在编译的时候，你有在看咱吧");
        tips.add("咕咕咕咕咕咕咕咕咕");
        tips.add("嘤嘤嘤嘤嘤嘤嘤嘤");
        tips.add("vivo50");
        tips.add("今天的编译器也很可爱呢w");
        tips.add("当编程遇到bug的时候，不妨出去走一走");
        tips.add("让我猜猜现在是什么时候呢~是晚上咩？");
        tips.add("让我猜猜现在是什么时候呢~是早上嘤？");
        tips.add("让我猜猜现在是什么时候呢~是下午喵？");
        tips.add("让我猜猜现在是什么时候呢~是中午嘛？");
        tips.add("来自java！");
        tips.add("不好看，在IDE睡了三小时");
        tips.add("不好看。睡了IDE三小时");
        tips.add("外面的天空怎么样呢~");
        tips.add("你有没有忘记什么要做的事情呀（盯");
        tips.add("qwq");
        tips.add("pwp");
        tips.add("就决定是你了！使用NullPointerException");
        tips.add("此代码妙不可言，唯有你和上帝知道");
        tips.add("注意休息喵（歪头");
        tips.add("你知道嘛，这个编译器的制作者是学材料学的哦w");
        tips.add("");

        tips.add("mcfpp中的函数没有返回值哦");
        tips.add("支持1.19.4+");
        tips.add("别写错别字哦（盯");
        tips.add("mcfpp会在函数中同时生成一些注释，让抽象的命令变得不那么抽象（或许（");
        tips.add("mcfpp至少应当在1.18的版本以上运行，因为1.18解除了记分板长度限制");
        tips.add("少用nbt可以有效地提升数据包的性能");
        tips.add("mcfpp会在编译的时候自动计算一些确定的值");
    }

    public static String getTip(){
        String s = tips.get((int) (Math.random() * tips.size()));
        if(s.equals("$time")){
            Date date = new Date();
            int hour = Integer.parseInt(new SimpleDateFormat("HH").format(date));
            if(hour < 6){
                s = "已经到" + new SimpleDateFormat("HH:mm").format(date) + "了欸，好晚了，还是要早点睡觉哦qwq";
            }else {
                s = "滴，编译器为您报时——现在是" + new SimpleDateFormat("HH:mm").format(date);
            }
        }
        return s;
    }
}
