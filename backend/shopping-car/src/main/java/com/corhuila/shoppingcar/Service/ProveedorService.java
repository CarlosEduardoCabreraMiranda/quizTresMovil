package com.corhuila.shoppingcar.Service;

import com.corhuila.shoppingcar.Document.Cliente;
import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IRepository.IProveedorRepository;
import com.corhuila.shoppingcar.IService.IClienteService;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements IProveedorService {
    @Autowired
    IProveedorRepository proveedorRepository;


    @Override
    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public Optional<Proveedor> findById(String id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public void update(Proveedor proveedor, String id) {
        Optional<Proveedor> pv = proveedorRepository.findById(id);

        if (!pv.isEmpty()) {
            Proveedor proveedorUpdate = new Proveedor();
            proveedorUpdate.setId(proveedor.getId());
            proveedorUpdate.setCodigo(proveedor.getCodigo());
            proveedorUpdate.setNombre(proveedor.getNombre());
            proveedorUpdate.setDireccion(proveedor.getDireccion());

            proveedorRepository.save(proveedorUpdate);
        } else {
            System.out.println("No existe el cliente");

        }
    }



    @Override
    public void delete(String id) {
        proveedorRepository.deleteById(id);
    }
}
