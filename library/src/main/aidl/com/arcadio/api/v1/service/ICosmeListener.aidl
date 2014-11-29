package com.arcadio.api.v1.service;
import java.util.List;
import com.arcadio.modelo.ItemVariable;
import com.arcadio.api.v1.service.ParceableCosmeError;
import com.arcadio.api.v1.service.ParceableCosmeStates;
import com.arcadio.modelo.VariablesList;

interface ICosmeListener {

	void notificarRefrescoVariables (String _nombreCesta,inout VariablesList _listaVariables);
	
	void notificarEstadoConexion (inout ParceableCosmeStates _estado);
   
    void notificarError (String _txtError);
    
   // void notificarEvento(EstadosCosme _codEvento, Telegrama _tlg);
   void notificarListaNombres(inout List<ItemVariable> listaNombres);
   void notificarIsNumeric(inout ItemVariable variable);
   void notificarNomACesta(String nomCesta, String nomVariable);
   void notificarCestaCreada(String nomCesta);
   

}