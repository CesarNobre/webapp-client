
/**
 * UsuarioBOCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package br.com.fiap.services;

    /**
     *  UsuarioBOCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UsuarioBOCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UsuarioBOCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UsuarioBOCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for buscarUsuario method
            * override this method for handling normal response from buscarUsuario operation
            */
           public void receiveResultbuscarUsuario(
                    br.com.fiap.services.UsuarioBOStub.BuscarUsuarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarUsuario operation
           */
            public void receiveErrorbuscarUsuario(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inserirUsuario method
            * override this method for handling normal response from inserirUsuario operation
            */
           public void receiveResultinserirUsuario(
                    br.com.fiap.services.UsuarioBOStub.InserirUsuarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inserirUsuario operation
           */
            public void receiveErrorinserirUsuario(java.lang.Exception e) {
            }
                


    }
    