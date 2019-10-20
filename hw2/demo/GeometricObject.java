package code;

public abstract class GeometricObject
{
    private String color = "white";
    private Boolean isFilled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, Boolean isFilled)
    {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Boolean getIsFilled()
    {
        return isFilled;
    }

    public void setIsFilled(Boolean isFilled){
        this.isFilled = isFilled;
    }
    public String toString(){
        return "created on " + dateCreated; 
    }
    public abstract double getPerimeter();
    public abstract double getArea();
}

