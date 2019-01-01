using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Atomics;
using System.Threading.Tasks;
using AspNetCoreApp.API.Models;
using Microsoft.AspNetCore.Mvc;

namespace AspNetCoreApp.API.Controllers
{
    [Route("")]
    [ApiController]
    public class GreetingsController : ControllerBase
    {
        private const string template = "Hello, {0}";
        private static int location = 0;
        
        // GET /greeting
        [HttpGet("greeting")]
        public ActionResult<GreetingModel> Get([FromQuery]string name = "World")
        {
            return new GreetingModel(Interlocked.Increment(ref location), String.Format(template, name));

        }

    }
}