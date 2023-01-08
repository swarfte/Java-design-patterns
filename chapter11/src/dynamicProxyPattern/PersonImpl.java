package dynamicProxyPattern;

public class PersonImpl implements Person{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonImpl(){

    }

    public PersonImpl(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender(){
        return gender;
    }

    @Override
    public String getInterests(){
        return interests;
    }

    @Override
    public int getHotOrNotRating(){
        return ratingCount == 0 ? 0 : rating / ratingCount;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setGender(String gender){
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests){
        this.interests = interests;
    }

    @Override
    public void setGeekRating(int rating){
        this.rating += rating;
        ratingCount++;
    }
}
