import QueryProvider from "./components/query-provider/query-provider";
import Vehicles from "./components/vehicles/vehicles";
import VehicleProvider from "./contexts/vehicle/vehicle-provider";

const App = () => {
  return (
    <>
      <QueryProvider>
        <VehicleProvider>
          <Vehicles />
        </VehicleProvider>
      </QueryProvider>
    </>
  );
};

export default App;
