package cn.edu.whut.sept.zuul;

/**
 *这个类保存有关用户发出的命令的信息。
 *命令当前由两个字符串组成：一个命令字和一个第二个命令字
 * 使用方法是命令已被检查为有效命令字。如果用户输入了一个无效的命令，那么命令单词是<NULL>。如果命令只有一个单词，那么第二个单词是<NULL>
 *
 */
public class Command
{
    private String commandWord;
    private String secondWord;

    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getCommandWord()
    {
        return commandWord;
    }

    public String getSecondWord()
    {
        return secondWord;
    }

    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
