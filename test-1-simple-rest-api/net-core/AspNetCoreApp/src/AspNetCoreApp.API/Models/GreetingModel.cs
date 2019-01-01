namespace AspNetCoreApp.API.Models
{
    public class GreetingModel
    {
        public GreetingModel(int id, string name)
        {
            Id = id;
            Name = name;
        }
        
        public int Id { get; set; }
        public string Name { get; set; }
    }
}