using System;


class InventorySystem
{
    public bool CheckInventory(int productId, float quantity)
    {
        Console.WriteLine($"Verificando el inventario para el producto, ID:  {productId}, cantidad: {quantity}");
        return true;
    }
}

class PaymentSystem
{
    public bool ProcessPayment(string paymenMethod, float amount)
    {
        Console.WriteLine($"Procesando pago de  {amount} mediante {paymenMethod}");
        return true;
    }
}

class ShippingSystem
{
    public bool ShipOrder(int orderID)
    {
        Console.WriteLine($"Enviando pedido con ID: {orderID}");
        return true;
    }

}
class OrderProcessFacade
{
    private InventorySystem _inventorySystem;
    private PaymentSystem _paymentSystem;
    private ShippingSystem _shippingSystem;

    public OrderProcessFacade()
    {
        _inventorySystem = new InventorySystem();
        _paymentSystem = new PaymentSystem();
        _shippingSystem = new ShippingSystem();
    }
    public bool PlaceOrder(int productId, float quantity, string paymenMethod, float amount)
    {
        bool inventaryAvailable = _inventorySystem.CheckInventory(productId, quantity);
        if (inventaryAvailable)
        {
            bool processPayment = _paymentSystem.ProcessPayment(paymenMethod, amount);
            if (processPayment)
            {
                bool orderShipped = _shippingSystem.ShipOrder(new Random().Next(1000, 9999));
                if (orderShipped)
                {
                    Console.WriteLine("Pedido realizado");
                    return true;
                }
            }
        }
        Console.WriteLine("Error al procesar el pedido");
        return false;
    }
}
class Program
{
    public static void Main(string[] args)
    {
        OrderProcessFacade orderProcesor = new OrderProcessFacade();
        bool orderPlaced = orderProcesor.PlaceOrder(123, 2, "Credito bancoppel", 1001);
    }
}