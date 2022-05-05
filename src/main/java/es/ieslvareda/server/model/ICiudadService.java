package es.ieslvareda.server.model;

import es.ieslvareda.model.Authentification;
import es.ieslvareda.model.Ciudad;
import es.ieslvareda.model.Empleado;
import es.ieslvareda.model.Result;

public interface ICiudadService {
    Result<Ciudad> getCiudad(Ciudad a);
}
