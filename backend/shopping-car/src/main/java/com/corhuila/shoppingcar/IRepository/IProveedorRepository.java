package com.corhuila.shoppingcar.IRepository;

import com.corhuila.shoppingcar.Document.Proveedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProveedorRepository extends MongoRepository<Proveedor, String> {
}
