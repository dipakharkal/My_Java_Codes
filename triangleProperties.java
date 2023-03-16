public class triangleProperties{

public static void main(String [] args){
int s1=2;
int s2=5;
int s3=4;

if(s1==s2 && s2==s3){
System.out.println("iso");
}
else if(s1==s2 || s2==s3 || s3==s1) {
System.out.println("s");
}
else{
System.out.println(3);
}
}
}