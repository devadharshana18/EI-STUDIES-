// Strategy Interface
interface RouteStrategy {
    String computeRoute(String start, String end);
}

// Concrete Strategies
class DrivingStrategy implements RouteStrategy {
    @Override
    public String computeRoute(String start, String end) {
        return "Driving route from " + start + " to " + end;
    }
}

class WalkingStrategy implements RouteStrategy {
    @Override
    public String computeRoute(String start, String end) {
        return "Walking route from " + start + " to " + end;
    }
}

class BikingStrategy implements RouteStrategy {
    @Override
    public String computeRoute(String start, String end) {
        return "Biking route from " + start + " to " + end;
    }
}

// Context
class NavigationContext {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void computeRoute(String start, String end) {
        System.out.println(strategy.computeRoute(start, end));
    }
}

// MainStrategyPatternDemo
public class  StrategyPatternDemo{
    public static void main(String[] args) {
        NavigationContext context = new NavigationContext();

        context.setStrategy(new DrivingStrategy());
        context.computeRoute("A", "B");

        context.setStrategy(new WalkingStrategy());
        context.computeRoute("A", "B");

        context.setStrategy(new BikingStrategy());
        context.computeRoute("A", "B");
    }
}
