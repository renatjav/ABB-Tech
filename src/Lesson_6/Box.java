package Lesson_6;

class Box {
    String name;
    int size;


    public Box(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o==null) {
            return false;
        }
        if (o instanceof Box box) {
            boolean equals = this.name.equals(box.name) && this.size == box.size;
            return equals;
        }
        return false;
    }

}