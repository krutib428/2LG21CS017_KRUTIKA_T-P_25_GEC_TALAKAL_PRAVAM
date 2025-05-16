import java.io.*;
import java.util.*;
public class Pattern1 {


public static void main(String arg[]){
  
//      int b=5, h=10;
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the base of the traingle");
//    b=sc.nextInt();
//    System.out.println("Enter the height of traingle is:");
//    h=sc.nextInt();
//     System.out.println("Area of the Traingle is:" +((b*h)/2)); 

//     int l=5, w=10;
//     Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the length of the Rectagle");
//    l=sc.nextInt();
//    System.out.println("Enter the wedth of Rectangle ");
//    w=sc.nextInt();
//     System.out.println("Area of the Rectagle is:" +(l*w)); 

  int c=0;
  Scanner sc=new Scanner(System.in);
  System.out.println( "Enter the number of row:"  );
 c=sc.nextInt();
 System.out.println( "left-aligned Triangle:"  );
  for(int i=1;i<=c;i++){
    {
  for(int j=1;j<=c-1;j++){
    System.out.print(" ");
    }
      for (int j=1; j<=i;j++){
    System.out.print("* ");
    }
    System.out.println();
  }
}
System.out.println( "center - aligned Triangle:"  );
for(int i=1;i<=c;i++){
  {
for(int j=1;j<=c-i;j++){
  System.out.print(" ");
  }
    for (int j=1; j<=i;j++){
  System.out.print(" * ");
  }
  System.out.println();
}

}
System.out.println( "Right- aligned Triangle:"  );
for(int i=1;i<=c;i++){
  {
for(int j=1;j<=c-i;j++){
  System.out.print(" ");
  }
    for (int j=1; j<=i;j++){
  System.out.print("*");
  }
  System.out.println();
}
}

System.out.println( "left-aligned numeric Triangle:"  );
  for(int i=1;i<=c;i++){
    {
  for(int j=1;j<=c-1;j++){
    System.out.print(" ");
    }
      for (int j=1; j<=i;j++){
    System.out.print(i+" ");
    }
    System.out.println();
  }
}

System.out.println( "center  aligned  numeric Triangle:"  );
for(int i=1;i<=c;i++){
  {
for(int j=1;j<=c-i;j++){
  System.out.print(" ");
  }
    for (int j=1; j<=i;j++){ 
  System.out.print(i+"   ");
  }
  System.out.println();
}

}

System.out.println( "Right aligned  numeric Triangle:"  );
for(int i=1;i<=c;i++){
  {
for(int j=1;j<=c-i;j++){
  System.out.print(" ");
  }
    for (int j=1; j<=i;j++){
  System.out.print(i+"");
  }
  System.out.println();
}
}
System.out.println( "left-aligned 10 Triangle:"  );
  for(int i=1;i<=c;i++){
    {
  for(int j=1;j<=c-1;j++){
    System.out.print(" ");
    }
      for (int j=1; j<=i;j++){
    System.out.print("10 ");
    }
    System.out.println();
  }
}

System.out.println( "center  aligned  10 Triangle:"  );
for(int i=1;i<=c;i++){
  {
for(int j=1;j<=c-i;j++){
  System.out.print(" ");
  }
    for (int j=1; j<=i;j++){
  System.out.print("10   ");
  }
  System.out.println();
}

}

System.out.println( "Right aligned 10 Triangle:"  );
for(int i=1;i<=c;i++){
  {
for(int j=1;j<=c-i;j++){
  System.out.print("  ");
  }
    for (int j=1; j<=i;j++){
  System.out.print("10");
  }
  System.out.println();
}

}

}


}








