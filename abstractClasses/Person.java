package abstractClasses;

/**
 * Created by liwenkui on 2017/3/23.
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
