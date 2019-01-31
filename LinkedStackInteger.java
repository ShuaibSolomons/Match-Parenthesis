import java.util.*;
public class LinkedStackInteger
{
	private GenNode front, tail;
	private int size;
	
	public LinkedStackInteger()
	{
		front = null;
		size = 0;
		tail = null;
	}
	
	public LinkedStackInteger(GenNode newFront, int newSize, GenNode newTail)
	{
		front = newFront;
		size = newSize;
		tail = newTail;
	}
	
	public GenNode getFront()				//this gets the first node
	{
		return front;
	}

	public GenNode getTail()				//this gets the last node which is the first node that was placed 
	{
		return tail;
	}
	

	public int getHeight()					//the amount of nodes on the stack
	{
		return size;
	}
	
	public void matcher(String item)
	{
		int count = 0, counter = 0;
		char tempChar = 'c';
		int[] keeperClose = new int[item.length()];
		int[] keeperOpen = new int[item.length()];

		for(int i=0; i<item.length(); i++)
		{
			GenNode temp = new GenNode(count);
			//System.out.print(i+"[[[[[[[["+item.substring(i,counter)+"]]]]]]]]");
			//System.out.println(item.charAt(i)+" this is one ");
			//System.out.println("YOUR POES!!!");
			if(item.charAt(i) == '(')
			{
				push(temp);
				//System.out.println("YOUR POES!!!");
				//Display();//System.out.println("this is pushing ");
				
			}

			
			
			else if(item.charAt(i) == ')')
			{
				//System.out.println("popping ");
				if(front == null)
				{
					System.out.println("Unmatched parenthesis at "+i);
					keeperClose[counter] = i;
					counter++;
					//Display();
					//continue;
				}
				
				pop();
			}
			
			count ++;	
		}
		
		if(size>0)
		{
			GenNode position = front;
			int counters = 0;
			while(position != null)
			{
				System.out.println("Unmatched parenthesis at "+position.getElement());
				int inter = Integer.parseInt(position.getElement().toString());
				keeperOpen[counters] = inter;
				counters++;
				position = position.getNext();
			}
		}

		System.out.println(item);
		
		
		
		String other = "", newOther = "", lastOther = "";
		
		for (int i = 1; i<=item.length(); i ++)
		{
			other = other+"0";
		}
		System.out.println(other);
		
		//System.out.println(keeperClose.length);
		for (int i= 0; i<=3; i++)
		{
			System.out.println(newOther);
			newOther = other.substring(0,(keeperClose[i]))+'>'+other.substring(keeperClose[i]+1);
		}
		//System.out.println(keeperOpen.length);
		
		for (int i = 1; i<=1; i++)
		{
			System.out.println(lastOther);
			lastOther = newOther.substring(0,(keeperOpen[i]))+'>'+newOther.substring(keeperOpen[i]+1);
		}
		
		
		
		
		/**counter = keeper.length-1;
		for (int i = 1; i<=item.length(); i++)
		{
			if(i == keeperClose[counter])
			{
				System.out.print(">");
				counter++;
			}
			
			else if (i == keeperOpen[
			System.out.print("0");
		}
		//System.out.println(keeperClose[keeperClose.length-2]);
		for (int i = 0; i<keeperClose[keeperClose.length]; i++)
		{
			System.out.println(keeperClose[i]);
		}
		/**counter = 0;
		for (int i = 0; i<(keeperClose[keeperClose.length]); i++)
		{
			
			if(i == keeperClose[counter])
			{
				
				System.out.print(">");
				counter++;
				if(i== (keeperClose[keeperClose.length]-1))
				{
					break;
				}
				continue;
			}
			System.out.print("0");
		}*/
		
		/**counter = 0;
		for (int i = keeperClose[keeperClose.length];i<(keeperOpen[keeperOpen.length]-1); i++)
		{
			if (i==keeperOpen[counter])
			{
				System.out.print("<");
				counter++;
				if(i == (keeperOpen[keeperOpen.length]-1))
				{
					break;
				}
				continue;
			}
			System.out.print("0");
			
		}*/

		
	}

	public void push(GenNode item)			//pushing a new node onto the stack
	{
		/**System.out.println("Your Pee Oh Ee Es");
		GenNode position = tail;
		item.setPrev(position);											//2nd try
		//position.setNext(item);
		tail = item;*/
		if(front== null)
		{
			front = item;
		}													//final
		else if(front != null)
		{
			item.setNext(front);
			front = item;
		}
		
		/**GenNode position = tail;
		item.setPrev(position.getPrev());
		item.setNext(position);											//1st try
		tail = item;
		position.getPrev().setNext(item);*/
		size++;
	}
	
	public void pop()				// poping the first node that was put onto the stack
	{
		/**GenNode position = front.getNext();
		//tail = position.getPrev();
		position = front;
		size--;*/
		
		if (size == 0 )
		{
			//System.out.println("there are no nodes to be popped");								//should be taken out if needed to show where there is nothing to pop
		}
		
		else
		{
			front = front.getNext();
			size--;
		}
	}
	public void addNodeToStart(GenNode item)			
	{
		item.setNext(front);
		front=item;
		size++;
	}
	
	public void Head()					//gets the last node that was put on the stack which is currently first
	{
		System.out.print(front.getElement());
	}
	
	public void Display()			//this is a toSting named as Display
	{
		//String s = "[";
		GenNode v = front;
		/**while ( v != null)
		//for(int i = 0; i<getHeight(); i++)
		{
			s = s + v.getElement();
			//System.out.println(v.getElement());
			v = v.getNext();
			if (v != null)
			{
				s = s+ ",";
			}
		}
		s = s + "]";*/
		System.out.print("[");
		while (v!= null)
		{
			System.out.print(v.getElement());
			v= v.getNext();
			if(v==null)
			{
				break;
			}
			System.out.print(",");
		}
		System.out.print("]");
		//return s;
	}

	public boolean isEmpty()				// tests to see if the stack is empty or not
	{
		int count = 0;         
		GenNode position = front;         
		while (position != null)        
		{
			if(count>=1)
			{
				return false;
			}
			//System.out.println("Your Pee Oh Ee Es");
			count++;             
			position = position.getNext(); 
			
		}
		return true;
	}
	
	public void deplete()				// deletes all the nodes int he stack so that the current height/size is 0
	{
		while(getHeight() != 0)
		{
			pop();
			//System.out.println("your poes!!"+LQ.getSize());
		}
	}







	/** This is the old methods derived from the DlinkQueue class in prac4 that i have left here as possible cheats for me to use if I like :D*/





	
	public void addToQueue(GenNode dataItem)
	{
		/**int count = 0;
		Node nwNode = new Node(dataItem);
		Node position = front;
		while (position != null)        
		{
			count++;
			position = position.getNext();
			
		}
		position.setNext(nwNode);
		tail = nwNode;*/
		//Node nwNode = new Node(dataItem);
		if (front == null)
		{
			front = dataItem;
		}
		GenNode position = tail;
		position.setNext(dataItem);
		tail = dataItem;
		size++;
		
	}
	
	public GenNode removeFromQueue()
	{
		/**GenNode position = front;
		Person save = new Person();
		if (position == null)
		{
			return null;
		}
		save = position.getElement();
		front = position.getNext();
		size--;
		return save;*/
		
		if (front != null)
		{
			//size=size-1;
			return deleteHeadNode();
		}
		else 
		{
			return null;
		}
	}
	
	public GenNode deleteHeadNode()
	{
		GenNode ans = front;
		front = front.getNext();
		size=size-1;
		return ans;
	}

	public boolean isOnList(GenNode dataItem)
	{
		int count = 0;         
		GenNode position = front;         
		while (position != null)        
		{
			if(position.getElement().equals(dataItem))
			{
				return true;
			}
			count++;             
			position = position.getNext(); 
			
		}
		return false;
	}
}
