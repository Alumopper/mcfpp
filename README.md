# **🚧本项目仓库已搬迁至[MCFPP Project](https://github.com/MinecraftFunctionPlusPlus/MCFPP)，并已经用Kotlin语言重写。项目跟进请前往新的仓库。🚧**

# **🚧This project has been moved to [MCFPP Project](https://github.com/MinecraftFunctionPlusPlus/MCFPP) and rewriten in Kotlin. Please go to new repository to follow our project.🚧**

# 介绍 Introduce

MCFPP是一个能被编译为Minecraft数据包的全新的面向对象的语言。它旨在以类似C系语言的语法，进行数据包的编写，并引入编程中常用的概念，从而使数据包的编
写更加的便利。

MCFPP is a brand new objected-oriented language that can be compiled into Minecraft Datapack. It aims to write datapacks
in a syntax similar to C language, and introduces commonly used concepts in programming, thereby making the writing of 
datapacks more efficient.

这个项目仍然处于早期的开发阶段中，尚不能用于实际运用。部分功能尚未实现，特性可能会在未来的版本中发生变化。库函数尚不齐全。

This project is still in the early stage of development and cannot be used for actual use. Some functions have not been
implemented, and features may change in future versions. The library is also not complete.

## 相关工程 Relative Projects
**[MCSharp](https://github.com/Alumopper/MCSharp)**

MCSharp是一个CSharp库。利用MCSharp，开发者可以使用CSharp进行数据包的开发。但是，此项目因为技术问题已经被停止。MCFPP继承了部分MCSharp的思想。

MCSharp is a CSharp library. Using MCSharp, developers can develop datapacks using CSharp. However, this project has been
stopped due to technical issues. MCFPP inherits part of the ideas of MCSharp.

**[justMCF](https://github.com/XiLaiTL/JustMCF)**

JustMCF是一个简化mcfunction工程的项目。使用JustMCF，你不但可以使用原版的命令，还可以使用项目设计的简化命令，可以使你的命令更加简洁高效。

JustMCF is a project to simplify mcfunction projects. Using JustMCF, you can not only use the original commands, but 
also use the simplified commands designed by the project, which can make your commands more concise and efficient.

# 特性 Features
MCFPP支持基本的逻辑语句<br>
MCFPP supports basic logical statements
```
func example(){
  int i = @s.pos[0];
  if(i > 0){
    @s.say("Hello Minecraft!");
  }
}
```
MCFPP支持面向对象的编程<br>
MCFPP supports object-oriented programming
```
class Example{
  int i;
  public Example(int i){
    this.i = i;
  }
  public func print(){
    sys.print(this.i);
  }
}
```
# 快速开始 QuickStart
[MCFPP Guider](http://mcfpp.alumopper.top:8000/quickstart)
