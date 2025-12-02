# Diagrama de Clases: Jerarquía de Vehículos

```
                         ┌───────────────────────────┐
                         │         Vehiculo          │
                         ├───────────────────────────┤
                         │ - marca : String          │
                         │ - modelo : String         │
                         │ - anio : int              │
                         ├───────────────────────────┤
                         │ + Vehiculo(marca, modelo, │
                         │            anio)          │
                         │ + mostrarInfo() : void    │
                         │ + encender() : void       │
                         └─────────────┬─────────────┘
                                       │
                    ┌──────────────────┴───────────────────┐
                    │                                      │
      ┌───────────────────────────┐         ┌───────────────────────────┐
      │    VehiculoTerrestre      │         │     VehiculoAcuatico      │
      ├───────────────────────────┤         ├───────────────────────────┤
      │ - numeroLlantas : int     │         │ - eslora : double         │
      ├───────────────────────────┤         ├───────────────────────────┤
      │ + VehiculoTerrestre(...)  │         │ + VehiculoAcuatico(...)   │
      │ + conducir() : void       │         │ + navegar() : void        │
      └─────────────┬─────────────┘         └─────────────┬─────────────┘
                    │                                      │
        ┌───────────┴───────────────┐           ┌──────────┴─────────────┐
        │                           │           │                          │
┌───────────────────────────┐ ┌───────────────────────────┐ ┌──────────────────────────────┐
│        Automovil          │ │       Motocicleta         │ │            Barco             │
├───────────────────────────┤ ├───────────────────────────┤ ├──────────────────────────────┤
│ - puertas : int           │ │ - tieneSidecar : boolean  │ │ - capacidadPasajeros : int   │
├───────────────────────────┤ ├───────────────────────────┤ ├──────────────────────────────┤
│ + Automovil(...)          │ │ + Motocicleta(...)        │ │ + Barco(...)                 │
│ + tocarClaxon() : void    │ │ + hacerCaballito() : void │ │ + sonarSirena() : void       │
│ + mostrarInfo() : void    │ │ + mostrarInfo() : void    │ │ + mostrarInfo() : void       │
└───────────────────────────┘ └───────────────────────────┘ └──────────────────────────────┘
```

