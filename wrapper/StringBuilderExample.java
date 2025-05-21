public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("String sau khi append: " + sb);
        
        sb.insert(6, "Java ");
        System.out.println("String sau khi insert: " + sb);
        
        sb.replace(6, 10, "Awesome");
        System.out.println("String sau khi replace: " + sb);
        
        sb.delete(6, 13);
        System.out.println("String sau khi delete: " + sb);
        
        sb.reverse();
        System.out.println("String sau khi reverse: " + sb);
    }
}
