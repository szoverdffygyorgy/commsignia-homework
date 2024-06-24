import Router from "../../routes/router";
import QueryProvider from "../query-provider/query-provider";

import "./app.css";

const App = () => {
  return (
    <>
      <QueryProvider>
        <Router />
      </QueryProvider>
    </>
  );
};

export default App;
