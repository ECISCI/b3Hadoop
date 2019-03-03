package com.hadoop.linux;

/**
 * @author Ming
 * @描述 Linux文件操作常用命令
 */
public class aibi_02 {
    /**
     * 1. makdir 创建文件夹
     */
    /*
     * @1.1 mkdir minghadoop<相对路径> 在当前目录下创建一个名为minghadoop的文件夹
     *
     * @1.2 mkdir -p mingaa/mingbb/mingcc<相对路径>
     *
     * 在当前目录下创建一个名为mingaa的文件夹,在mingaa目录下创建mingbb文件夹,在mingbb下创建mingcc文件夹
     *
     * 参数-p 如果文件夹不存在则创建
     *
     * @1.3 mkdir /data <绝对路径> 在根目录下创建一个data文件夹
     */

    /**
     * 2.删除文件夹
     */
    /*
     * @2.1 rmdir 可以删除空目录
     *
     * @2.2 rm -r mingaa 递归删除,删除 mingaa整个文件夹及其中所有子节点(但会出现是否删除提 需要输入 y（yes 确定删除）
     * n（no不删除）来确定是否删除当前文件夹)
     *
     * @2.3 rm -rf mingaa 强制删除mingaa下所有文件夹
     *
     */

    /**
     * 3.修改文件夹名称
     */
    /*
     * @3.1 mv mingaa mingangle 将文件夹mingaa的名字更改mingangle
     *
     * @3.2
     */

    /**
     * 4.创建文件
     */
    /*
     * @4.1 touch somefile.text 在当前目录下创建一个somefile.1的空文件
     *
     * @4.2 echo "i miss you baby" 在屏幕的控制台输出字符串"i miss you baby"
     *
     * @4.3 echo "i miss you baby" > somefile.text
     *
     * 如果somefile.text文件不存在 则创建somefile.text文件并向文件中打印 i miss you baby
     *
     * 利用重定向 > 的功能,将一条指令的输出结果写入一个文件中(并且覆盖掉源文件内容)
     *
     * @4.4 echo "ni hao e luo si" >>somefile.text
     *
     * 在文件中追加内容写入ni hao e luo si的字符串（不会覆盖掉源文件内容,只是追加内容）
     *
     * @4.5 用文本编辑器来编辑生成文件 vi
     */

    /**
     * 5.vi 编辑器的快捷键
     */

    /*
     * @5.1 i 进入编辑模式
     *
     * @5.2 a 在光标后一位开始插入
     *
     * @5.3 A 在该行的最后插入
     *
     * @5.4 I 在该行的最前面插入
     *
     * @5.5 gg 直接跳到文件的首行
     *
     * @5.6 G 直接跳到文件的末行
     *
     * @5.7 dd 删除行:如果5dd 则一次性删除光标后的5行
     *
     * @5.8 yy 复制当前行
     *
     * @5.10 p 粘贴
     *
     * @5.11 复制多行 则 3yy 复制当前行附近的3行
     *
     * @5.12 v 进入字符选择模式 选择完成后按y复制 按住p粘贴
     *
     * @5.13 ctrl + v 进入块选择模式,选择完成后,按y复制 按p粘贴
     *
     * @5.14 shift + v 进入 行选择模式 ,按y复制 按p粘贴
     *
     * @5.15 %s/ming/xiaoming 在底行命名模式下 将文件中所有的替换成 xiaoming
     *
     * @5.16 /you 效果:查找文件中出现的you,并定位到第一个找到的地方 按n可以定位到下一个匹配位置 按N可以定位到上一个位置
     *
     */

    /**
     * 6. 修改文件名称
     */
    /*
     * @6.1 mv ming.text mingHadoop/mingHadoop.text
     *
     * 将 ming.text移动到mingHadoop文件夹下并将ming.text的文件名更改为 mingHadoop.text
     */

    /**
     * 7.查看当前Linux 是32位还是64位
     */
    /*
     * getconf LONG_BIT
     */

    /**
     * 8.查看网络监听
     */
    /*
     * netstat -nltp
     */

}
