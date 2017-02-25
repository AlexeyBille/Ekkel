package ch17.ex8;

class SListIterator<T> {


    SListIterator(SList.Link start) {
        currentLink = start;
    }

    private SList.Link currentLink;

    boolean hasNext(){
        return currentLink.nextLink != null;
    }
    T next() {
        currentLink = currentLink.nextLink;
        return (T) currentLink.t;
    }
    void add(T t) {
        SList.Link temp = new SList.Link(t);
        if(currentLink.nextLink != null){
            temp.nextLink = currentLink.nextLink;
            currentLink.nextLink = temp;
        } else {
            currentLink.nextLink = temp;
            currentLink = temp;
        }

    }

    void remove(T t) {
        currentLink = currentLink.nextLink;
    }

}
