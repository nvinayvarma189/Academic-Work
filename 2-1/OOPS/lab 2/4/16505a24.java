import java.util.Scanner;

class Fourth{

public static void main(String[] args){
Subfourth ram=new Subfourth();
Subfourth seeta=new Subfourth();
ram.sub(10);
seeta.sub(20);
Subfourth mediator=new Subfourth();
mediator=ram;
ram=seeta;
seeta=mediator;
ram.print();
seeta.print();
}
}
