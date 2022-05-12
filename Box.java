package oop;

public class Box {

    int width;
    int height;
    int depth;
    String color;
    String material;
    Boolean isReusable;

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", isReusable=" + isReusable +
                '}';
    }


    public Box(int width, int height, int depth, String color, String material, Boolean isReusable) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.material = material;
        this.isReusable = isReusable;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Boolean getReusable() {
        return isReusable;
    }

    public void setReusable(Boolean reusable) {
        isReusable = reusable;
    }

    public int calculateVolume() {


        return width * height * depth;
    }
}
