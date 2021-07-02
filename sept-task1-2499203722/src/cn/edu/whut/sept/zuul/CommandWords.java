package cn.edu.whut.sept.zuul;

/**
 * 这个类包含游戏已知的所有命令
 * 单词的枚举当输入命令时，它用于识别命令。
 */
public class CommandWords
{
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * 检查给定的字符串是否是有效的命令。
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
