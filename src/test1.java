

class test1
{
    public static void main (String[] args) {
    	long start = System.nanoTime();
    	boolean toggle = true;
        String str = ("ABABABABABCC") ;
        int count = 0;
        
        while (toggle) {
            count++;
            toggle = false;
            if (str.contains("AB")) {
            	//StringUtils.replace(str, "AB","AA");
                str = str.replace("AB", "A");
                toggle = true;
            }
            //System.out.println(str);
            if (str.contains("BA")) {
                str = str.replace("BA", "A");
                toggle = true;
            }
            //System.out.println(str);
            if (str.contains("BC")) {
                str = str.replace("BC", "C");
                toggle = true;
            }
            //System.out.println(str);
            if (str.contains("CB")) {
                str = str.replace("CB", "C");
                toggle = true;
            }
           //System.out.println(str);
            if (str.contains("AA")) {
                str = str.replace("AA", "A");
                toggle = true;
            }
            //System.out.println(str);
            if (str.contains("CC")) {
                str = str.replace("CC", "C");
                toggle = true;
            }
            System.out.println(str);
        }
        System.out.println(count);
        long end = System.nanoTime() - start;
        System.out.println("Time taken : " + end);
    }
}