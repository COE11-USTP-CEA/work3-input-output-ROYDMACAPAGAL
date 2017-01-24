class project3io{
    
    public static void main(String [] args ){
        for(String i : args ){
            System.out.println(i);
        }
        System.out.println("Num1: there are"+args.length+"arguments");
        for( int x=0; x<args.length;x++){
            System.out.println(args[x]);
        }
        System.out.println("Num2: there are " + args.length+"arguments");
    }
}