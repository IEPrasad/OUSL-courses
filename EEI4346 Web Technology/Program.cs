// Here's a complete example of a minimal ASP.NET Core application with all the necessary code in one file. This example uses a simplified approach for demonstration purposes.

### `Program.cs`

```csharp
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.MapGet("/", async context =>
{
    await context.Response.WriteAsync("Welcome to your first .NET web page!");
});

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();

public class HomeController : Microsoft.AspNetCore.Mvc.Controller
{
    public IActionResult Index()
    {
        ViewData["Message"] = "Welcome to your first .NET web page!";
        return View();
    }
}
```

### `Views/Home/Index.cshtml`

This file should be placed in the `Views/Home` folder:

```html
@{
    ViewData["Title"] = "Home Page";
}

<h1>@ViewData["Message"]</h1>
<p>This is a sample .NET web page!</p>
```

### Running the Application

1. **Create a New Project Directory**: Save the `Program.cs` file in a new directory named `WebAppExample`.
2. **Create Views Folder**: Inside the `WebAppExample` directory, create a `Views/Home` folder.
3. **Create View File**: Save the `Index.cshtml` file in the `Views/Home` folder.
4. **Run the Application**: Open a terminal, navigate to the `WebAppExample` directory, and run:

    ```bash
    dotnet new console
    dotnet run
    ```

This example combines the main components of an ASP.NET Core application into a single file for simplicity, though in a real application, these would typically be separated into different files and folders.
