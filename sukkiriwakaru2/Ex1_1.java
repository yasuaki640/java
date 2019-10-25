class Ex1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(",");

        for (int i = 1; i <= 100; i++)
            sb.append(i).append(",");

        String s = sb.toString();
        String[] a = s.split(",");
        
        for(String e: a)
        System.out.print(e +" ");
    }
}