package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/proveedor")
public class ProveedorController {
    //Inyectar el servicio
    @Autowired
    private IProveedorService Pservice;

    @GetMapping()
    public List<Proveedor> findAll() {
        return Pservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable String id) {
        return Pservice.findById(id);
    }

    @PostMapping()
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return Pservice.save(proveedor);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Proveedor proveedor, @PathVariable String id) {
        Pservice.update(proveedor, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        Pservice.delete(id);
    }
}
