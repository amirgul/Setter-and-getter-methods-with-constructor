public class GeneralDog
{
    private String name;
    private int age;
    private double weight;

    public GeneralDog()
    {
        name ="no name yet";
        age = 0;
        weight = 0;
    }
    public void setGeneralDog(String newName, int newAge, double newWeight)
    {
        setDog(newName, newAge, newWeight);
    }
    public GeneralDog(String initialName, int initialAge, double initialWeight)
    {
        setDog(initialName, initialAge, initialWeight);
    }
    public void setName(String newName)
    {
        setDog(newName, age, weight);
    }
    public void setAge(int newAge)
    {
        setDog(name, newAge, weight);
    }
    public void setWeight(double newWeight)
    {
        setDog(name, age,newWeight);
    }
    public GeneralDog(String initialName)
    {
        setDog(initialName, 0 , 0);
    }
    public GeneralDog(int initialAge)
    {
        setDog("no name yet", initialAge, 0);

    }
    public GeneralDog(double initialWeight)
    {
        name ="no name yet";
        weight = initialWeight;
        age = 0;
    }
    public void writeOutput()
    {
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("Weight: "+ weight);
    }
    private void setDog(String newName, int newAge, double newWeight)
    {
        name = newName;
        if((newAge <= 0)||(newWeight <= 0))
            System.out.println("Wrong parameter entered for age and weight");
        else
        {
            age = newAge;
            weight = newWeight;

        }

    }


}
