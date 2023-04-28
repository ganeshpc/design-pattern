package abstract_factory;

import org.example.abstract_factory.FurnitureFactory;
import org.example.abstract_factory.ModernFurnitureFactory;
import org.example.abstract_factory.VictorianFurnitureFactory;
import org.example.abstract_factory.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void testVictorianSet() {
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Chair victorianChair = victorianFurnitureFactory.createChair();
        Sofa victorianSofa = victorianFurnitureFactory.createSofa();
        Table victorianTable = victorianFurnitureFactory.createTable();

        Assertions.assertInstanceOf(VictorianChair.class, victorianChair);
        Assertions.assertInstanceOf(VictorianSofa.class, victorianSofa);
        Assertions.assertInstanceOf(VictorianTable.class, victorianTable);
    }

    @Test
    public void testModernSet() {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();

        Chair victorianChair = modernFurnitureFactory.createChair();
        Sofa victorianSofa = modernFurnitureFactory.createSofa();
        Table victorianTable = modernFurnitureFactory.createTable();

        Assertions.assertInstanceOf(ModernChair.class, victorianChair);
        Assertions.assertInstanceOf(ModernSofa.class, victorianSofa);
        Assertions.assertInstanceOf(ModernTable.class, victorianTable);
    }
}
