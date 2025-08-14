class HelloWorld {
    public static void main(String[] args) {
        whatsItDo("WATCH");
    }
    public static void whatsItDo(String str) {
    int len = str.length(); 
    if (len > 1) {
        String temp = str.substring(0, len - 1);
        whatsItDo (temp);
        System.out.println(temp);
        }
    }
}
