package college.util;
public class TextUtils {
private static int count=0;

    private TextUtils()
    {
    }

    public static String normalizeName(String name)
    {
        if(name==null||name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");

        name=name.trim();

        StringBuilder sb=new StringBuilder();
        boolean space=false;

        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);

            if(ch==' '||ch=='\t')
            {
                space=true;
            }
            else
            {
                if(space&&sb.length()>0)
                    sb.append(' ');

                if(sb.length()==0||sb.charAt(sb.length()-1)==' ')
                    sb.append(Character.toUpperCase(ch));
                else
                    sb.append(Character.toLowerCase(ch));

                space=false;
            }
        }

        count++;
        return sb.toString();
    }

    public static int getCount()
    {
        return count;
    }    
}
