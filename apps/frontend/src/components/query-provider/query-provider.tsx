import { QueryClient, QueryClientProvider } from "@tanstack/react-query";
import { PropsWithChildren } from "react";

const QueryProvider = ({ children }: PropsWithChildren) => {
  const queryClient = new QueryClient({
    defaultOptions: { queries: { refetchInterval: 5000 } },
  });

  return (
    <QueryClientProvider client={queryClient}>{children}</QueryClientProvider>
  );
};

export default QueryProvider;
