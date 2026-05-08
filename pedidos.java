public class NewClass1 {

      public static class producto {

        //attribute
        String nombreProducto;
        int cantidad_disponible;
        Double precio;

        //constructures
        public producto (String nombreProducto) {
            This.nombreProducto = "";
            This.cantidad_disonible = "";
            This.precio = "";
        }

        //Metodos (getters y setters)
        public String getNombreProducto() {return nombreProducto; }
        public void setNombreProducto (String nombreproducto) {this.nombreProducto = nombreproducto; }

        public int getcantidad_disponible() {return cantidad_disponible; }
        public void setcantidad_disponible (int cantidad_disponible) {this.cantidad_disponible = cantidad_disponible; }

        public Double getPrecio() {return precio; }
        public void setPrecio (Double precio) {this.precio = precio; }

    }
    public static class itemPedido {

        //attribute
        Object producto;
        int cantidad_solicitada;

        //constructures
        public itemPedido (String Producto,int cantidad_solicitada ) {
            this.producto = "";
            this.cantidad_solicitada = ""; //i dunno

        }
        public Object getProducto() {return producto; }
        public void setProducto (objet producto) {this.producto = producto; } //error en objet

        public int getCantidad_solicitada() {return cantidad_solicitada; }
        public void setCantidad_solicitada (int cantidad_solicitada) {this.cantidad_solicitada = cantidad_solicitada; }
    }
    public static class pedido {

        //attribute
        String idpedido;
        String estado;
        ArrayList<String> listaItemPedidos = new ArrayList<>();

        //constructures
        public pedido (String idpedidos,String estado, String listaItemPedidos ) {
            this.idpedido;
            this.estado = "";
            this.listaItemPedidos.of("");
        }

        public String getIdpedido() {return idpedido; }
        public void setIdpedido (String idpedido) {this.idpedido = idpedido; }

        public String getEstado() {return estado; }
        public void setEstado (String estado) {this.estado = estado; }

        // falta array
        //public String getNombreProducto() {return nombreProducto; }
        //public void setNombreProducto (string nombreproducto) {this.nombreproducto = nombreproducto; }
    }
    public static void main(String[] args) {
        launch();
    }
  }

}