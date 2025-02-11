using System;
using System.DirectoryServices.AccountManagement;

namespace DebugUserPrincipal
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                
                PrincipalContext context = new PrincipalContext(ContextType.Domain, "ds.lab", "dc=ds,dc=lab", "stoneuser", "VMware1!");
            
                string identityvalue = "groot";
                UserPrincipal user = UserPrincipal.FindByIdentity(context, identityvalue);

                if (user != null)
                {
                    Console.WriteLine($"User found: {user.DisplayName}");
                }
                else
                {
                    Console.WriteLine("User not found");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine($"Exception: {e.Message}");
                throw;
            }
            
        }
        
        //public new static UserPrincipal FindByIdentity(PrincipalContext context, string identityValue)
        //{
        //    return (UserPrincipal)Principal.FindByIdentityWithType(context, typeof(UserPrincipal), identityValue);
        //}
    }
}