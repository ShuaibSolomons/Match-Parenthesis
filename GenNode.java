public class GenNode<E>
{
	private E element;
	private GenNode<E> next, prev;
	
	
	public GenNode()
	{
		next = null;
		prev = null;
	}

	public GenNode(E newElemnt, GenNode<E> n, GenNode<E> p)
	{
		element = newElemnt;
		next = n;
		prev = p;
	}
	public GenNode(E newElemnt)
	{
		element = newElemnt;
		next = null;
	}
	public E getElement()
	{
		return element; 
	}
	public GenNode<E> getNext()
	{ 
		return next;
	}
	public GenNode<E> getPrev()
	{
		return prev;
	}
	public void setElement(E newElem)
	{ 
		element = newElem; 
	}
	public void setNext(GenNode<E> newNext)
	{
		next = newNext; 
	}
	public void setPrev(GenNode<E> newPrev)
	{
		prev = newPrev;
	}
}
