import QueryProvider from "./components/query-provider/query-provider";
import Vehicles from "./components/vehicles/vehicles";

const App = () => {
  return (
    <>
      <QueryProvider>
        <Vehicles />
      </QueryProvider>
    </>
  );
};

export default App;
