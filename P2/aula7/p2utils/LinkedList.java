package p2utils;

/** This class implements a List abstract data type using a linked list.
 * Please note that this is p2utils.LinkedList.
 * It is NOT the java.util.LinkedList class in the standard Java library!
 */
public class LinkedList<E> {

  private Node<E> first = null;
  private Node<E> last = null;
  private int size = 0;

  /** {@code LinkedList} constructor, empty so far.
   */
  public LinkedList() { }

  /** Returns the number of elements in the list.
   * @return Number of elements in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /** Returns the first element in the list.
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";

    return first.elem;
  }

  /** Returns the last element in the list.
   * @return Last element in the list
   */
  public E last() {
    assert !isEmpty(): "empty!";

    return last.elem;
  }

  /** Adds the given element to the start of the list.
   * @param e the element to add
   */
  public void addFirst(E e) {
    first = new Node<>(e, first);
    if (isEmpty())
      last = first;
    size++;

    assert !isEmpty(): "empty!";
    assert first().equals(e) : "wrong element";
  }

  /** Adds the given element to the end of the list.
   * @param e the element to add
   */
  public void addLast(E e) {
    Node<E> newest = new Node<>(e);
    if (isEmpty())
      first = newest;
    else
      last.next = newest;
    last = newest;
    size++;

    assert !isEmpty(): "empty!";
    assert last().equals(e) : "wrong element";
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    first = first.next;
    size--;
    if (isEmpty())
      last = null;
  }

  /** Removes all elements.
   */
  public void clear() {
    first = last = null;
    size = 0;
  }

  /** Checks if the given element exists in the list.
   * @param e an element
   * @return {@code true} if the element exists and {@code false} otherwise
   */
  public boolean contains(E e) { 
    return contains(first, e); 
  }
  private boolean contains(Node<E> n, E e) {
    if (n == null) return false;
    if (n.elem==null) return e==null; //dispensável, se impedirmos elem==null
    if (n.elem.equals(e)) return true; 
    return contains(n.next, e);
  }

  /** Prints all elements, one per line. */
  public void print() {
    print(first);
  }
  private void print(Node<E> n) {
    if (n != null) {
      System.out.println(n.elem);
      print(n.next);
    }
  }

  // funções adicionais pedidas no guião...
  public LinkedList<E> clone(){
    LinkedList<E> ret = clone(first);
    return ret;
  }

  private LinkedList<E> clone(Node<E> n){
    if (n == null) {
      return new LinkedList<>();
    }
    LinkedList<E> ret = clone(n.next);
    ret.addFirst(n.elem);
    return ret;
  }

  public LinkedList<E> reverse(){
    LinkedList<E> ret = reverse(first);
    return ret;
  }

  private LinkedList<E> reverse(Node<E> n){
    if (n == null) {
      return new LinkedList<>();
    }
    LinkedList<E> ret = reverse(n.next);
    ret.addLast(n.elem);
    return ret;
  }

  public E get(int n){
    assert n >= 0 && n < size();
    return get(n, first);
  }

  private E get(int pos, Node<E> n){
    if(pos == 0) return n.elem;
    return get(pos-1, n.next);
  }

  public LinkedList<E> concatenate(LinkedList<E> lst){
    return concatenate(clone(), lst.first);
  }

  private LinkedList<E> concatenate(LinkedList<E> lst1, Node<E> n){
    if(n == null) return lst1;
    lst1.addLast(n.elem);
    return concatenate(lst1, n.next);
  }

  public void remove(E e){
    remove(e, first);
  }

  private void remove(E elem, Node<E> n){
    if(elem.equals(n.elem)) first = n.next;
    if(elem.equals(n.next.elem)) n.next = n.next.next;
    else remove(elem, n.next);
  }
}