package IteratorPattern;

public class NameRepository implements Container{
    private String names[] = {"A","B","C","D"};
    @Override
    public Iterator getIterator() {
        return new NameInterator();
    }

    private class NameInterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (index == names.length) {
                return null;
            }
            Object name = names[index];
            index++;
            return name;
        }
    }
}
