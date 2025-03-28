# Service Registry (Eureka) [microservice-with-sb-service-registry]

🔗 **For a complete overview of the microservices architecture and setup, please refer to the [Main README](https://github.com/code-with-rj1399/microservice-with-sb-api-gateway/blob/master/README.md).**

The **Service Registry** (powered by **Eureka**) is a critical component of the microservices architecture. It allows services to register themselves and discover other services dynamically, enabling load balancing and fault tolerance.

## How to Start

1. Clone this repository.
2. Open the project in your IDE.
3. Navigate to the `Application` class.
4. Run the application.

## Service Details

- **Port:** `8761`
- **Registers with Eureka:** ❌ (Acts as the registry, not a client)
- **Dashboard:** Accessible at **[Eureka Dashboard](http://localhost:8761/)**
- **Responsibilities:**
    - Registers microservices (Department, Employee, API Gateway, etc.).
    - Provides service discovery to dynamically route requests.

## API Gateway

All services registered with **Eureka** are accessible through the **[API Gateway](http://localhost:8083)** for centralized routing and security.  
