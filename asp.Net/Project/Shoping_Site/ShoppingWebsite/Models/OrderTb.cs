//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ShoppingWebsite.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class OrderTb
    {
        public int OrderId { get; set; }
        public int ProductId { get; set; }
        public int User { get; set; }
        public Nullable<int> Quantity { get; set; }
        public Nullable<decimal> UnitPrice { get; set; }
        public Nullable<decimal> TotalAmount { get; set; }
        public byte[] Status { get; set; }
    
        public virtual ProductTb ProductTb { get; set; }
        public virtual UserTb UserTb { get; set; }
    }
}