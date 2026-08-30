public class StringBuilderToolkit
{
    static String reverse(String text)
    {
        if(text==null)
            return null;
        StringBuilder sb=new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    static String repeat(String text,int count)
    {
        if(text==null||count<0)
            return null;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<count;i++)
            sb.append(text);
        return sb.toString();
    }

    static String joinWords(String[] words,String separator)
    {
        if(words==null||separator==null)
            return null;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            if(i>0)
                sb.append(separator);
            sb.append(words[i]);
        }
        return sb.toString();
    }

    static String removeCharacterAt(String text,int index)
    {
        if(text==null||index<0||index>=text.length())
            return null;
        StringBuilder sb=new StringBuilder(text);
        sb.deleteCharAt(index);
        return sb.toString();
    }

    static String replaceCharacterAt(String text,int index,char replacement)
    {
        if(text==null||index<0||index>=text.length())
            return null;
        StringBuilder sb=new StringBuilder(text);
        sb.setCharAt(index,replacement);
        return sb.toString();
    }

    static String buildNumberList(String[] items)
    {
        if(items==null)
            return null;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<items.length;i++)
        {
            if(i>0)
                sb.append(", ");
            sb.append(items[i]);
        }
        return sb.toString();
    }
}