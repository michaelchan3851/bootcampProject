package javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        float TotalOrderCost = 0.0f;
        for (Map.Entry<Furniture, Integer> orderOfFurniture : this.ordersOfFurnitures.entrySet()) {
            TotalOrderCost += getTypeCost(orderOfFurniture.getKey());
        }
        return TotalOrderCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (this.ordersOfFurnitures.get(type) == null)
            return 0;
        return this.ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (this.ordersOfFurnitures.get(type) == null)
            return 0;
        return type.cost() * this.ordersOfFurnitures.get(type);
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int TotalOrderQuatity = 0;
        for (Map.Entry<Furniture, Integer> orderOfFurniture : this.ordersOfFurnitures.entrySet()) {
            TotalOrderQuatity += getTypeCount(orderOfFurniture.getKey());
        }
        return TotalOrderQuatity;
    }
}