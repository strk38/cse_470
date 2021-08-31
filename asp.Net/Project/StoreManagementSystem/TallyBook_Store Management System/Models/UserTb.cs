//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace TallyBook_Store_Management_System.Models
{
    using System;
    using System.Collections.Generic;
    using System.Web;
    using System.ComponentModel;
    using System.ComponentModel.DataAnnotations;

    public partial class UserTb
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public UserTb()
        {
            this.CustomerTbs = new HashSet<CustomerTb>();
            this.InventoryTbs = new HashSet<InventoryTb>();
            this.SupplierTbs = new HashSet<SupplierTb>();
        }

        public int UId { get; set; }
        [Required(ErrorMessage = "Enter User Name")]
        public string UName { get; set; }
        [DataType(DataType.EmailAddress)]
        [Required(ErrorMessage = "***")]
        public string UEmail { get; set; }
        [DataType(DataType.Password)]
        [Required(ErrorMessage = "***")]
        public string UPassword { get; set; }
        [DataType(DataType.Password)]
        [Required(ErrorMessage = "***")]
        [Compare("UPassword")]
        public string ConfirmPassword { get; set; }
        [Required(ErrorMessage = "Enter Shop Name")]
        public string UShopName { get; set; }


        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<CustomerTb> CustomerTbs { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<InventoryTb> InventoryTbs { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<SupplierTb> SupplierTbs { get; set; }
    }
}