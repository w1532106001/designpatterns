package Singleton;

/**
 * @author whc
 * @date 2020/7/21
 * @description 保证了Elvis的全局唯一性
 */

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {

    }
}
