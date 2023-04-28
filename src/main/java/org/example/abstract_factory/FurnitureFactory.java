package org.example.abstract_factory;

import org.example.abstract_factory.model.Chair;
import org.example.abstract_factory.model.Sofa;
import org.example.abstract_factory.model.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
