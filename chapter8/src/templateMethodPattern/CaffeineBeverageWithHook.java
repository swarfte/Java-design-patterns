package templateMethodPattern;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // <--- Hook
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() { // the hook method
        return true;
    }
}
