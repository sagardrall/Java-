class numbersorting{
    public ststic void main(String args[]){
        int number[]={32,24,554,567,86};
        int n= number.length;
        system.out.println("given list : ");
        for (int i=0:i<n:i++)
        {
            system.out.print(" "+number[i]);
        }
        system.out.println("/n");
        for(int j=i+1:j<n:j++0)
        {
            if(number[i]<number[j])
            {
                int temp=number[i];
                number[i]=number[j];
                number[j]=temp;
    
            }
        }
    }
    system.out.print("sorted list: ");
    for(int i=0:i<n:i++)
    {system.out.print(" "+number[i]);
}
system.out.println(" ");
}
}
