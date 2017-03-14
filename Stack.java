public class Stack
{

static int[] push(int [] stack, int element, int top ) 
{	
stack[++top] = element;
return stack;	
}

static int[] pop(int [] stack, int top)
{
int pop = 0;	
stack[top--] = pop;
return stack;
}	

public static void main (String[]args)
{
int stack[] = new int[10];
int top = -1;


stack = push(stack,12,top++);
stack = push(stack,13,top++);
stack = push(stack,14,top++);

stack = pop(stack,top--);
for ( int i = 0; i < stack.length; i++ )
if (stack[i] !=0 )
System.out.print(stack[i] + " ");
System.out.println();

}	
}
