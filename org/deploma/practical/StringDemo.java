package deploma.practical;

public class StringDemo {

    public static void main(String[] args) {
        String name = "abc";
        String name2 = "abc";

        String name3 = new String("abc");

        if (name == name2) {
            System.out.println(true);

        }
        if (name.equals(name3)) 
        
        {
            System.out.println(true);
        }
        if (name == name3) {
            System.out.println(true);
        }else 
            System.out.println(false);

        StringBuffer stringBuffer = new StringBuffer("Chakradhae Shinde");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.reverse());
        

        StringBuilder stringBuilder = new StringBuilder("Phulera");
        System.out.println(stringBuilder.append(" Gram Panchayat"));
        System.out.println(stringBuilder.insert(0, " "));


        String name4 = stringBuilder.toString();
        System.out.println(name4);

        System.out.println(stringBuffer.equals(stringBuilder));

    }

}
